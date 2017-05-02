$('#login').submit(function(event){
    event.preventDefault();

    $.ajax({
        method: 'POST',
        dataType: 'json',
        data: $(this).serializeArray(),
        url: '/loginCheck',
        success: function(response) {
            if (!response) {
                $('#login')
                    .animate({marginLeft: '+5px', marginRight: '-5px'}, 0)
                    .animate({marginLeft: '-10px', marginRight: '+10px'}, 50)
                    .animate({marginLeft: '+10px', marginRight: '-10px'}, 100)
                    .animate({marginLeft: '-10px', marginRight: '+10px'}, 150)
                    .animate({marginLeft: '0px', marginRight: '0px'}, 150);

                $('#login input')
                    .not('#login input[type="submit"]')
                    .css('border', '1px solid red');

                $('#login input[name="password"]').val('');

                $('#incorrect-information').show();
            } else {
                $('#incorrect-information').hide();
            }
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