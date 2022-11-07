document.addEventListener('DOMContentLoaded', domLoadedFunc);

function domLoadedFunc(){
    
    let obj = {}
    
	let table = document.createElement('table');
	let show = document.getElementById('show');
	show.appendChild(table);
	
	let thead = document.createElement('thead');
	let tr = document.createElement('tr');
	
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
	
	let books = ['도서코드', '도서명', '저자', '출판사', '가격'];
	for(let book of books){
		let idTag = document.createElement('th');
		let idTxt = document.createTextNode(book); 
		idTag.appendChild(idTxt);
		tr.appendChild(idTag);
	}	
	
	thead.appendChild(tr);
	table.appendChild(thead);
	
	
	let tbody = document.createElement('tbody');
	table.appendChild(tbody);
	let fields = ['book_code', 'book_name', 'author', 'press', 'price'];

	document.querySelector('button[type="button"]').addEventListener('click', function(){
		let book_code = document.getElementById('book_code').value;
		let book_name = document.getElementById('book_name').value;
		let author = document.getElementById('author').value;
		let press = document.getElementById('press').value;
		let price = document.getElementById('price').value;
		let check = book_code && book_name && author && press && price;
		if(!check){
			alert('빈 칸을 채워주세요.')
		    return;
		}
		let newRow = {
			book_code : book_code, 
			book_name : book_name,
			author : author,
			press : press,
			price : price	
					
		}
		document.querySelector('#show>table>tbody').appendChild(makeTr(newRow));
	});
	
	
	document.querySelectorAll('button[type="button"]')[1].addEventListener('click', selDelFunc);
		
	function selDelFunc(){
      let selDel = document.querySelectorAll("input[type='checkbox']:checked");
        for(let i = 0; i < selDel.length; i++)
        {
            selDel[i].parentElement.parentElement.remove();
        }
    };
	

	function makeTr(row){
		let tr = document.createElement('tr');
		
		let td = document.createElement('td');
		td.style.textAlign = 'center';
		let chk = document.createElement('input');
		chk.addEventListener('change', function(){
			console.log(this.checked);
		});
		chk.setAttribute('type', 'checkbox');
		td.appendChild(chk);
		tr.appendChild(td);

		tr.addEventListener('click', showDetailFunc);
		
		for(let field of fields){
			let td = document.createElement('td');
			let txt = document.createTextNode(row[field]);
			td.appendChild(txt);
			tr.appendChild(td);
		}
		
		td = document.createElement('td');
		let btn = document.createElement('button');
		btn.addEventListener('click', function(){
			console.log(this);
			this.parentElement.parentElement.remove();
		})
		let txt = document.createTextNode('삭제');
		td.appendChild(btn);
		btn.appendChild(txt);
		tr.appendChild(td);
		
		return tr;
	} 
	
	function showDetailFunc(){
        document.getElementById('book_code').value = (this.children[0].textContent);
		document.getElementById('book_name').value = (this.children[1].textContent);
		document.getElementById('author').value = (this.children[2].textContent);
		document.getElementById('press').value = (this.children[4].textContent);
		document.getElementById('price').value = (this.children[3].textContent);
	}
}