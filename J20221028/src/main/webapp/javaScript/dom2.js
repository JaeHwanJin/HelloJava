/**
 * 
 */

document.addEventListener('DOMContentLoaded', domLoadedFunc);

function domLoadedFunc(){
    let data = `[{"id":1,"first_name":"Andrew","last_name":"Denney","email":"adenney0@zdnet.com","gender":"Male","salary":2499},
    {"id":2,"first_name":"Vitia","last_name":"Makeswell","email":"vmakeswell1@gravatar.com","gender":"Female","salary":5788},
    {"id":3,"first_name":"Dominique","last_name":"Ferroni","email":"dferroni2@jimdo.com","gender":"Male","salary":9956},
    {"id":4,"first_name":"Michaeline","last_name":"Volett","email":"mvolett3@apple.com","gender":"Female","salary":3544}
	]`;

    let obj = {}
    let result = JSON.parse(data); 
   
	// 확장 for
	// table
	let table = document.createElement('table');
	let show = document.getElementById('show');
	show.appendChild(table);
	
		// thead
	let thead = document.createElement('thead');
	let tr = document.createElement('tr');
	let titles = ['아이디', '이름', '이메일', '성별', '급여', '삭제'];
	for(let title of titles){
		let idTag = document.createElement('th');
		let idTxt = document.createTextNode(title); //<th>아이디</th>
		idTag.appendChild(idTxt);
		tr.appendChild(idTag);
	}	
	
	// checkbox 생성 전체선택
	let td = document.createElement('th');
	let checkbox = document.createElement('input');
	checkbox.setAttribute('type', 'checkbox');
	checkbox.addEventListener('change', function(){
		let cks = document.querySelectorAll('#show input[type = "checkbox"]');
		cks.forEach(function(check){
			check.checked = checkbox.checked;
			
		});		
	})
	td.appendChild(checkbox);
	tr.appendChild(td);
	
	thead.appendChild(tr);
	table.appendChild(thead);
	
	
	//tbody
	let tbody = document.createElement('tbody');
	table.appendChild(tbody);
	let fields = ['id', 'first_name', 'email', 'gender', 'salary'];
	for(let obj of result){	//데이터 건수만큼 반복
		
		let tr = makeTr(obj);
		tbody.appendChild(tr); 
	} //end of 	for(let obj of result) 
	
	
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
	
	
	// 수정버튼에 이벤트 등록
	document.querySelectorAll('button[type="button"]')[1].addEventListener('click', updateFunc);
	
	function updateFunc(){
		let trs = document.querySelectorAll('#show>table>tbody>tr');
		let id = document.getElementById('id').value;
		for(let i = 0 ; i < trs.length; i++){
			if(id == trs[i].children[0].textContent){
				trs[i].children[4].textContent = document.getElementById('salary').value;
				trs[i].children[3].textContent = document.getElementById('gender').value;
				trs[i].children[2].textContent = document.getElementById('email').value;
				trs[i].children[1].textContent = document.getElementById('fname').value;
			}
		}
	}


	// 선택삭제 클릭시 선택된 항목들만 삭제
	document.querySelectorAll('button[type="button"]')[2].addEventListener('click', selDelFunc);
		
	function selDelFunc(){
      let selDel = document.querySelectorAll("input[type='checkbox']:checked");
        for(let i = 0; i < selDel.length; i++)
        {
            selDel[i].parentElement.parentElement.remove();
        }
    };
	

	function makeTr(row){
		let tr = document.createElement('tr');
		tr.addEventListener('click', showDetailFunc);
		tr.addEventListener('mouseover', function(){
			this.style.backgroundColor = 'yellow';
		})
		tr.addEventListener('mouseout', function(){
			this.style.backgroundColor = null;
		})
		for(let field of fields){
			// 항목만큼 반복
			let td = document.createElement('td');
			let txt = document.createTextNode(row[field]);
			td.appendChild(txt);
			tr.appendChild(td);
		}
		
		
		// 삭제버튼 <td><button>삭제</button></td>
		let td = document.createElement('td');
		let btn = document.createElement('button');
		btn.addEventListener('click', function(){
			console.log(this);
			this.parentElement.parentElement.remove();
		})
		let txt = document.createTextNode('삭제');
		td.appendChild(btn);
		btn.appendChild(txt);
		tr.appendChild(td);
		
		
		// 체크박스 
		td = document.createElement('td');
		td.style.textAlign = 'center';
		let chk = document.createElement('input');
		chk.addEventListener('change', function(){
			console.log(this.checked);
		});
		chk.setAttribute('type', 'checkbox');
		td.appendChild(chk);
		tr.appendChild(td);

		
		return tr;
	} //end of Maketr()
	
	function showDetailFunc(){
        document.getElementById('id').value = (this.children[0].textContent);
		document.getElementById('fname').value = (this.children[1].textContent);
		document.getElementById('email').value = (this.children[2].textContent);
		document.getElementById('salary').value = (this.children[4].textContent);
		document.getElementById('gender').value = (this.children[3].textContent);
	}
}// end of domLoadedFunc()