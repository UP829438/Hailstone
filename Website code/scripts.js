var bool = true;
function runDropDown() {
    document.getElementById("drop").classList.toggle("show");
    if (bool) {
      document.getElementById("image").src="img/drawing2.svg";
      bool = false;
    } else {
      document.getElementById("image").src="img/drawing.svg";
      bool = true;
    }

}
function rundrop1() {
  document.getElementById("sidedrop1").classList.toggle("show");
}

function rundrop2() {
  document.getElementById("sidedrop2").classList.toggle("show");
}

$(function() {
  $(".weekdrop1").click(function() {
    $(".weekdrop1").toggleClass("weekdropchange");
        $(".drop2content").toggleClass("drop2move");
  });
});

$(function() {
  $(".weekdrop2").click(function() {
    $(".weekdrop2").toggleClass("weekdropchange");
  });
});
