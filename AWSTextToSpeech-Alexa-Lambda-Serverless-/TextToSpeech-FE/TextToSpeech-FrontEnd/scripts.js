API_ENDPOINT = "https://h7ddkn2eq0.execute-api.us-east-1.amazonaws.com/Prod/NewPost"
document.getElementById("sayButton").onclick = function () {
	var Voice = $('#voiceSelected option:selected').val()
	var Text = $('#postText').val()

	POST_ENDPOINT = API_ENDPOINT + '?voice=' + Voice + '&text=' + Text
	$(".tap2").show();
	$(".tap1").show();
	$.ajax({
		url: POST_ENDPOINT,
		type: 'POST',
		contentType: 'text/plain; charset=utf-8',
		success: function (response) {
			for (let key in response) {
				if (response.hasOwnProperty("Post-Id"))
					postId = response[key]
			}
			document.getElementById("postIDreturned").textContent = "Post ID: " + postId;
			$(".tap2").hide();
			$(".tap1").hide();
		},
		error: function () {
			alert("error");
		}
	});
}

document.getElementById("searchButton").onclick = function () {

	var postId = $('#postId').val();

	$.ajax({
		url: API_ENDPOINT + '?postId=' + postId,
		type: 'GET',
		contentType: 'text/plain; charset=utf-8',
		success: function (response) {
			$('#posts tr').slice(1).remove();
			var player = "<audio controls><source src='" + response["url"] + "' type='audio/mpeg'></audio>"

			$("#posts").append("<tr> \
								<td>" + response["id"] + "</td> \
								<td>" + response["voice"] + "</td> \
								<td>" + response["text"] + "</td> \
								<td>" + response["status"] + "</td> \
								<td>" + player + "</td> \
								</tr>");
		},
		error: function () {
			alert("error");
		}
	});
}
document.getElementById("postText").onkeyup = function () {
	var length = $(postText).val().length;
	document.getElementById("charCounter").textContent = "Characters: " + length;
}
