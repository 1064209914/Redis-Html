function myAlert(title,content,CallBack){
	$.alert({
	    title: title,
	    content: content,
	    confirm: function(){
	    	if (typeof CallBack === "function") {
	    		CallBack();
			}
	    }
	});
}
function myConfirm(title,content,confirmCallBack,cancelCallBack){
	$.confirm({
	    title: title,
	    content: content,
	    confirm: function(){
	    	if (typeof confirmCallBack === "function") {
	    		confirmCallBack();
			}
	    },
	    cancel: function(){
	    	if (typeof cancelCallBack === "function") {
	    		cancelCallBack();
			}else{
				return false;
			}
	        
	    }
	});
}