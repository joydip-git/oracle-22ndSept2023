var names = ['anil', 'sunil', 'mahesh']
function buttonClicked() {
    //window.alert(new Date().toTimeString())

    //accessing DOM elements from JS code
    //DOM => provides the structure of your HTML elements through series of objects
    //from JS code these objects and its properties/methods (known as DOM APIs) can be accessed

    var divElement = document.createElement('div')
    divElement.innerHTML = "Current Time: " + new Date().toLocaleTimeString()
    divElement.classList.add('div')
    document.body.append(divElement)

    var ulObject = document.getElementById('listOfPeople')
    ulObject.style.backgroundColor = "beige"
    for (var index = 0; index < names.length; index++) {
        //<li></li>
        var liElement = document.createElement('li')
        //<li>anil</li>
        liElement.innerText = names[index]
        //<ul><li>anil</li></ul>
        liElement.style.color = "green"
        liElement.style.fontFamily = "Lucida Sans"
        ulObject.append(liElement)
    }
}

