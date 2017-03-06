

$(document).ready(function(){
	$("form").submit(function(){
		alert("insert row sucessfully");
	});
});

function validationForm()
{
	var id= document.supplierForm.id.value;
	var fname=document.supplierForm.fname.value;
	var lname=document.supplierForm.lname.value;
	var email=document.supplierForm.email.value;
	var address=document.supplierForm.address.value;
	var mobileNumber=document.supplierForm.mobile.value;
	var officeNumber=document.supplierForm.office.value;

		  if(id==null||id==""){
			  document.getElementById("vid").innerHTML="id cant be blank";
			  return false;
		  }
		else if(isNaN(id)){
					document.getElementById("vid").innerHTML="enter numeric value only";
					return false;}
		else if (fname==null||fname=="") {
			document.getElementById("vfname").innerHTML="first name cant be blank";
			  return false;
		}
		else if (lname==null||lname=="") {
			document.getElementById("vlname").innerHTML="last name cant be blank";
			  return false;
			}
		  else if (email==null||email=="") {
			  document.getElementById("vemail").innerHTML="email cant be blank";
			return false;
		}
		/*else if (!eamil.contains("@")) {
			document.getElementById("vemail").innerHTML="enter correct emial id";
				return false;
			}
*/
		  else if (address==null||address=="") {
			  document.getElementById("vaddress").innerHTML="address cant be blank";
			  return false;
		}
		  else if (mobileNumber==null||mobileNumber=="") {
			  document.getElementById("vmobile").innerHTML="mobile number cant be blank";
			  return false;
		}
		  else if (isNaN(mobileNumber)) {
			  document.getElementById("vmobile").innerHTML="enter numeric value only";
			  return false;
			
		}
		  else if (officeNumber==null||officeNumber=="") {
			  document.getElementById("voffice").innerHTML="officee number cant be blank";
			return false;
		}
		  else if (isNaN(officeNumber)) {
			  document.getElementById("voffice").innerHTML="enter neumeric value only";
		}
}