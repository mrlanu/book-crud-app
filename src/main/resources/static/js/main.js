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
			document.getElementById("author").disabled = true; 
			$('.myForm #id').val(book.id);
			$('.myForm #title').val(book.title);
			$('.myForm #description').val(book.description);
			$('.myForm #author').val(book.author);
			$('.myForm #isbn').val(book.isbn);
			$('.myForm #printYear').val(book.printYear);
			$('.myForm #readAlready').val(book.readAlready);
			});
		$('.myForm #exampleModal').modal();
		}else{
			document.getElementById("author").disabled = false; 
			$('.myForm #id').val('');
			$('.myForm #title').val('');
			$('.myForm #description').val('');
			$('.myForm #author').val('');
			$('.myForm #isbn').val('');
			$('.myForm #printYear').val('');
			$('.myForm #readAlready').val('');
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

