/**
 * 
 */

document.addEventListener('DOMContentLoaded', function(){ 
	let show = document.getElementById('show');
	let form = document.createElement('form');
	
// id.
	let txt = document.createTextNode('ID : ');
	let input = document.createElement('input');
	input.setAttribute('type', 'text'); 
	input.setAttribute('id', 'id');
	let br = document.createElement('br');
	form.appendChild(txt);  
	form.appendChild(input); 
	form.appendChild(br);
	show.appendChild(form);
	
//name
	txt = document.createTextNode('Name : ');
	input = document.createElement('input');
	input.setAttribute('type', 'text');
	input.setAttribute('id', 'name');
	br = document.createElement('br');
	form.appendChild(txt);  
	form.appendChild(input); 
	form.appendChild(br);
	show.appendChild(form);
	
	document.getElementById('show').appendChild(form);
	
	
//phone
	txt = document.createTextNode('Phone : ');
	input = document.createElement('input');
	input.setAttribute('type', 'text');
	input.setAttribute('id', 'phone');
	br = document.createElement('br');
	form.appendChild(txt);  
	form.appendChild(input); 
	form.appendChild(br);
	show.appendChild(form);
	
//전송
	input = document.createElement('input');
	input.setAttribute('type', 'submit');
	input.setAttribute('value', '전송');
	form.appendChild(input);
	form.appendChsild(form);

	document.getElementById('id').value='user1';
})


