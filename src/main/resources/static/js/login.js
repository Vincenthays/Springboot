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

$('#login input[name="login"]')
    .data('html', 'true')
    .attr('title', 'Entrer vos <strong>identifiants moodle</strong> afin de vous connecter')
    .tooltip();