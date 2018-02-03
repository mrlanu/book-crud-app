/**
 * 
 */

$(document).ready(function(){
	
	$('.nBtn, .table .eBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		var text = $(this).text();
		if(text=='Edit'){
			$.get(href, function(book,status){
				document.getElementById("author").readOnly = true; 
				$('.myForm #id').val(book.id);
				$('.myForm #title').val(book.title);
				$('.myForm #description').val(book.description);
				$('.myForm #author').val(book.author);
				$('.myForm #isbn').val(book.isbn);
				$('.myForm #printYear').val(book.printYear);
				$('.myForm #readAlready').val(book.readAlready);
				var r =	book.readAlready;
				if(r==true){
					document.getElementById("yes").checked = true; 
				}else {
					document.getElementById("no").checked = true;
					}
				});
				$('.myForm #exampleModal').modal();
		}else{
				document.getElementById("author").readOnly = false; 
			//	document.getElementById("readAlready").checked = true; 
				$('.myForm #id').val('');
				$('.myForm #title').val('');
				$('.myForm #description').val('');
				$('.myForm #author').val('');
				$('.myForm #isbn').val('');
				$('.myForm #printYear').val('');
			//	$('.myForm #readAlready').val('');
				$('.myForm #exampleModal').modal();
			
		}
	
	});
	
	$('.table .delBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#myModal #delRef').attr('href',href);
		$('#myModal').modal();
	});
});

