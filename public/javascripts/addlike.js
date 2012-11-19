function addLike(number){
    var json = (function () {
        $.ajax({
            'async': false,
            'global': false,
            'url': "/board/addlike/" + number,
            'dataType': "json",
            'success': function (data) {
                json = data.likes;
            }
        });
        return json;
    })();
        $("div#likes" + number ).html(json + " like/s this");
}
