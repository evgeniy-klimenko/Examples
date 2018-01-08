$(document).ready(function() {
    var canvas = $('#canvas')[0];
    canvas.width = window.innerWidth -50;
    canvas.height = window.innerHeight;

    if (canvas.getContext) {
        var ctx = canvas.getContext('2d');
        var w = canvas.width;
        var h = canvas.height;
        ctx.lineWidth = 2;
        ctx.lineCap = 'round';

        var spawnRadius = 200;
        var speed = spawnRadius / 10;

        var init = [];
        var maxParts = 300;
        for (var a = 0; a < maxParts; a++) {
            var initX = w / 2 + Math.random() * spawnRadius - spawnRadius / 2;
            var initY = h / 2 + Math.random() * spawnRadius - spawnRadius / 2;

            var r = Math.round(Math.random() * 255);
            var g = Math.round(Math.random() * 255);
            var b = Math.round(Math.random() * 255);

            init.push({
                x: initX,
                y: initY,
                xs: (initX - w / 2) / speed,
                ys: (initY - h / 2) / speed,
                l: Math.random() * 5,
                color: 'rgb(' + r + ',' + g + ',' + b + ')'
            })
        }

        var particles = [];
        for (var b = 0; b < maxParts; b++) {
            particles[b] = init[b];
        }

        function draw() {
            ctx.clearRect(0, 0, w, h);
            for (var c = 0; c < particles.length; c++) {
                var p = particles[c];
                ctx.strokeStyle = 'rgba(255,255,255,' + p.l / 20 + ')';
                ctx.beginPath();
                ctx.moveTo(p.x, p.y);
                ctx.lineTo(p.x + p.l * p.xs, p.y + p.l * p.ys);
                ctx.stroke();
            }
            move();
        }

        function move() {
            for (var b = 0; b < particles.length; b++) {
                var p = particles[b];
                p.x += p.xs;
                p.y += p.ys;

                // if particle position exceeds the canvas
                if (p.x < 0 || p.y < 0 || p.x > w || p.y > h) {
                    p.x = w / 2 + Math.random() * spawnRadius - spawnRadius / 2;
                    p.y = h / 2 + Math.random() * spawnRadius - spawnRadius / 2;
                    p.xs = (p.x - w / 2) / speed;
                    p.ys = (p.y - h / 2) / speed;
                }
            }
        }

        setInterval(draw, 30);

    }
});



////xzz

//function popup_img(filename)
//{
//   var newImage = new Image();
//   newImage.src = filename;
//   newWin = window.open(filename,'win',
//"width="+newImage.width+",height="+newImage.height+",resizable=no,scrollbars=no,status=no");
//}







//Chart
