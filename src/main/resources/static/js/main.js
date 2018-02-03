/**
 * 
 */

$(document).ready(function(){
	
	$('.table .eBtn').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$.get(href, function(book,status){
			$('.myForm #id').val(book.id);
			$('.myForm #title').val(book.title);
			$('.myForm #description').val(book.description);
			$('.myForm #author').val(book.author);
			$('.myForm #isbn').val(book.isbn);
			$('.myForm #printYear').val(book.printYear);
			$('.myForm #readAlready').val(book.readAlready);
			
		});
		$('.myForm #exampleModal').modal();
	});
});