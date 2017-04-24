$('#login').submit(function(event){
    event.preventDefault();

    $.ajax({
        method: 'POST',
        dataType: 'json',
        data: $(this).serializeArray(),
        url: '/loginCheck',
        success: function(response) {
            console.log(response);
        }
    });
});

if ($(window).width() > 768) {
    $('#login input[name="login"]').data('placement', 'right');
}

$('[data-toggle="tooltip"]').tooltip();

$('[data-scroll]').click(function(){
    $('body').animate({scrollTop: $( $(this).data('scroll') ).offset().top}, 1000);
});