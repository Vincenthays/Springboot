$('#addStudent button').click(function(){
    var studentName = $('#addStudent input[name="studentName"]').val();

    $.ajax({
        url: 'student/'+studentName,
        method: 'PUT',
        dataType: 'json',
        successs: displayStudents()
    });
});

function displayStudents() {
    $.ajax({
        url: 'student',
        method: 'GET',
        dataType: 'json',
        success: function(students) {
            var html = '';
            console.log(students);
            students.forEach(function(student) {
                html +=
                    '<tr>'+
                        '<td scope="row" >'+student.id+'</td>'+
                        '<td>'+student.name+'</td>'+
                    '</tr>'
                ;
            });

            $('table tbody').html(html);
        }
    });
}

