const delay = 1000;
const elements = document.getElementsByClassName('alternate');
const elements2 = document.getElementsByClassName('alternate2');
let counter = 2;
let counter2 = 2;

function changeImage() {
    if (counter === 1)
        changeImage2();
    for (let img of elements) {
        img.src = img.src.replace(/\d(?=\.png)/, counter);
    };
    counter = counter < 8 ? counter + 1 : 1;
    _ = setTimeout(changeImage, delay);
}

function changeImage2() {
    for (let img of elements2) {
        img.src = img.src.replace(/\d(?=\.png)/, counter2);
    };
    counter2 = counter2 < 8 ? counter2 + 1 : 1;
}

_ = setTimeout(changeImage, delay);