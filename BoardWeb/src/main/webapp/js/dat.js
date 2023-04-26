function sendDat(boardNumber, boardAuthor){
	let cot = $("#comment").val()
	$("#comment").val(' ')
	$.ajax({
		url: 'datlist',
		type: 'POST',
		data: {
			author : boardAuthor,
			number : boardNumber,
			comment : cot
		},
		success: function(result) {
			  var li = $("<li>").text("작성자: " + boardAuthor + ", 댓글 : " + cot);
    		$("ul").append(li);
		},
		error: function() {
			console.log('뭔가 이상하다')
		}
	})
}