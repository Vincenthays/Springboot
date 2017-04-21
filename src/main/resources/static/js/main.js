$('input[data-livesearch]').keyup(function(){
    var search = $(this).val().toUpperCase();

    var dataResult = $(this).parent().parent().children('[data-result]').children();

    if( search != '' ) {

        dataResult.each(function(){

            if($(this).text().toUpperCase().indexOf(search) != -1) {
                $(this).show();
            } else{
                $(this).hide();
            }

            // console.log($(this).text());
            // console.log($(this).text().indexOf(search));
            // console.log('-------------------');
        });
    }
    else {
        dataResult.show();
    }
});

if( $('div[data-result]').height() > 700 ) {
    $('div[data-result]').css({
        'max-height': '700px',
        'overflow-y': 'scroll'
    });
}