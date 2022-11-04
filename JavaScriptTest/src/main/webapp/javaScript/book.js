document.addEventListener('DOMContentLoaded', function(){
// 추가버튼에 이벤트 등록
	document.querySelector('button[type="button"]').addEventListener('click', function(){
		let id = document.getElementById('id').value;
		let fn = document.getElementById('fname').value;
		//let ln = document.getElementById('lname').value;
		let em = document.getElementById('email').value;
		let sa = document.getElementById('salary').value;
		let gn = document.getElementById('gender').value;
		let check = id && fn && em && sa && gn;
		if(!check){
			alert('입력항목 확인')
		    return;
		}
		let newRow = {
			id : id, 
			first_name : fn,
			//last_name : ln,
			email : em,
			salary : sa,
			gender : gn	
					
		}
		document.querySelector('#show>table>tbody').appendChild(makeTr(newRow));
	});
    td = document.createElement('td');
		let btn = document.createElement('button');
		btn.addEventListener('click', function(){
			this.parentElement.parentElement.remove();
		})	
		btn.textContent = '삭제';
		td.appendChild(btn);
		tr.appendChild(td);
})

