$(document).ready(function() {
    $('a#goc_orvette').click(function(event) {
        event.preventDefault();
        $('#overlay').fadeIn(400,
            function() {
                $('#modal_form')
                    .css('display', 'block')
                    .animate({
                        opacity: 1,
                        top: '50%'
                    }, 200);
            });
    });




    $('#modal_close, #overlay').click(function() {
        $('#modal_form')
            .animate({
                    opacity: 0,
                    top: '45%'
                }, 200,
                function() {
                    $(this).css('display', 'none');
                    $('#overlay').fadeOut(400);
                }
        );
    });
});



var c_orvette = document.getElementById("c_orvette");


var data = {
    labels: ["Speed", "Crew", "Firepower", "Armor", "Comfort", "Shields", "Sneak"],
    datasets: [{
            label: "Corvette",
            backgroundColor: "rgba(179,181,198,0.2)",
            borderColor: "#ffa500",
            pointBackgroundColor: "#ffa500",
            pointBorderColor: "#fff",
            pointHoverBackgroundColor: "#fff",
            pointHoverBorderColor: "#ffa500",
            data: [10, 5, 6, 5, 10, 4, 3]
        },

    ]
};


new Chart(c_orvette, {
    type: "radar",
    data: data,
    options: {
        scale: {
            ticks: {
                beginAtZero: true
            }
        }
    }
});


//var myRadarChart = new Chart(c_orvette, {
//    type: 'radar',
//    data: data,
//    options: options
//});


$(document).ready(function() {
    $('a#goc_orvette1').click(function(event) {
        event.preventDefault();
        $('#overlay1').fadeIn(400,
            function() {
                $('#modal_form1')
                    .css('display', 'block')
                    .animate({
                        opacity: 1,
                        top: '50%'
                    }, 200);
            });
    });




    $('#modal_close1, #overlay1').click(function() {
        $('#modal_form1')
            .animate({
                    opacity: 0,
                    top: '45%'
                }, 200,
                function() {
                    $(this).css('display', 'none');
                    $('#overlay1').fadeOut(400);
                }
        );
    });
});



var c_orvette1 = document.getElementById("c_orvette1");


var data1 = {
    labels: ["Speed", "Crew", "Firepower", "Armor", "Comfort", "Shields", "Sneak"],
    datasets: [{
            label: "Interceptor",
            backgroundColor: "rgba(179,181,198,0.2)",
            borderColor: "#800000",
            pointBackgroundColor: "#800000",
            pointBorderColor: "#fff",
            pointHoverBackgroundColor: "#fff",
            pointHoverBorderColor: "#ffa500",
            data: [10, 5, 9, 9, 10, 10, 10]
        },

    ]
};


new Chart(c_orvette1, {
    type: "radar",
    data: data1,
    options: {
        scale: {
            ticks: {
                beginAtZero: true
            }
        }
    }
});
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

$(document).ready(function() {
    $('a#gon_ormandysr1').click(function(event) {
        event.preventDefault();
        $('#overlay2').fadeIn(400,
            function() {
                $('#modal_form2')
                    .css('display', 'block')
                    .animate({
                        opacity: 1,
                        top: '50%'
                    }, 200);
            
            });
    });




    $('#modal_close2, #overlay2').click(function() {
        $('#modal_form2')
            .animate({
                    opacity: 0,
                    top: '45%'
                }, 200,
                function() {
                    $(this).css('display', 'none');
                    $('#overlay2').fadeOut(400);
                }
        );
    });
});



var n_ormandysr1 = document.getElementById("n_ormandysr1");


var data2 = {
    labels: ["Speed", "Crew", "Firepower", "Armor", "Comfort", "Shields", "Sneak"],
    datasets: [{
            label: "Normandysr1",
            backgroundColor: "rgba(179,181,198,0.2)",
            borderColor: "#0000ff",
            pointBackgroundColor: "#0000ff",
            pointBorderColor: "#fff",
            pointHoverBackgroundColor: "#fff",
            pointHoverBorderColor: "#ffa500",
            data: [10, 5, 8, 7, 10, 6, 10]
        },

    ]
};

new Chart(n_ormandysr1, {
    type: "radar",
    data: data2,
    options: {
        scale: {
            ticks: {
                beginAtZero: true
            }
        }
    }
});

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

$(document).ready(function() {
    $('a#gon_ormandysr2').click(function(event) {
        event.preventDefault();
        $('#overlay3').fadeIn(400,
            function() {
                $('#modal_form3')
                    .css('display', 'block')
                    .animate({
                        opacity: 1,
                        top: '50%'
                    }, 200);
            });
    });




    $('#modal_close3, #overlay3').click(function() {
        $('#modal_form3')
            .animate({
                    opacity: 0,
                    top: '45%'
                }, 200,
                function() {
                    $(this).css('display', 'none');
                    $('#overlay3').fadeOut(400);
                }
        );
    });
});




var n_ormandysr2 = document.getElementById("n_ormandysr2");


var data3 = {
    labels: ["Speed", "Crew", "Firepower", "Armor", "Comfort", "Shields", "Sneak"],
    datasets: [{
            label: "Normandysr2",
            backgroundColor: "rgba(179,181,198,0.2)",
            borderColor: "#ffa500",
            pointBackgroundColor: "#ffb666",
            pointBorderColor: "#fff",
            pointHoverBackgroundColor: "#fff",
            pointHoverBorderColor: "#ffa500",
            data: [10, 10, 10, 10, 10, 10, 10]
        },

    ]
};


new Chart(n_ormandysr2, {
    type: "radar",
    data: data3,
    options: {
        scale: {
            ticks: {
                beginAtZero: true
            }
        }
    }
});
