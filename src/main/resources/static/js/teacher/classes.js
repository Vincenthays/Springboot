$('#form-add-student').submit(function(event) {
    event.preventDefault();

    var student = {
        "id": parseInt($('#form-add-student input[name="id"]').val()),
        "name": $('#form-add-student input[name="name"]').val(),
        "first_name": $('#form-add-student input[name="first_name"]').val(),
        "role": {
            id: 1
        }
    };

    $.ajax({
        method: 'POST',
        contentType: 'application/json',
        url: '/api/user',
        data: JSON.stringify(student),
        success: function(response) {
            console.log('success');
        }
    });
});


$('#lsit-teacher-groupes div').onclick(function () {
    console.log($(this));
})