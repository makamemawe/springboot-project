$('document').ready(function(){
//console.log('makame')
        $('.table .editBtn').on('click',function(event){
            event.preventDefault();
            var href= $(this).attr('href');
            $.get(href, function(us, status){
                $('#userIdedit').val(us.userId);
                $('#userNameedit').val(us.userName);
                $('#userAddressedit').val(us.userAddress);
                $('#phoneedit').val(us.phone);
            });

            $('#editModal').modal('show');
      });
      $(' .table .deleteButton').on('click',function(event){
      event.preventDefault();
      var href = $(this).attr('href');
      $('#deleteModel #delRef').attr('href',href);
      $('deleteModel').model('show');
      });

});
