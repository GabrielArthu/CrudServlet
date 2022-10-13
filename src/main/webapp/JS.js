/**
 * 
 */function confirmacao (){
	function gamsOver(){
    //Pop up the score retry and close..
    let tEnd = document.querySelector('#gameOver')
    tEnd.style.display= 'inline-block'
    console.log("palavra errada")

    let scr = document.querySelector("#score");
    scr.textContent = score()
    }
}