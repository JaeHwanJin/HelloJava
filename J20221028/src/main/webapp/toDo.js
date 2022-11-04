// toDo.js

let inputBox = document.getElementById('inputField');  
let addToDo = document.getElementById('addToDo');      
let toDoList = document.getElementById('toDoList');    

addToDo.addEventListener('click', function(){    
    let li = document.createElement('li');    
    if (!inputBox.value)          
        alert('내용을 입력해 주세요!');
    else {
        li.textContent = inputBox.value; 
        toDoList.appendChild(li);      
        inputBox.value= " ";              
    }
})