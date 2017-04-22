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