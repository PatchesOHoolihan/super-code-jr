let c = document.createElement("pixels");
let img1 = new Image();

img1.onload = function(){
    document.getElementsByClassName("bio-img").remove();
    w = img1.width;
    h = img1.height;

    c.width = w;
    c.height = h;
    ctx = c.getContext("2d");
    ctx.drawImage(img1,0,0);

    let pixelArr = ctx.getImageData(0,0,w,h).data;
    let sample_size = 80;

    for(let y=0;y<h;y+=sample_size)
        for(let x=0;x<w;x+=sample_size){
            let p = (x+(y*w))*4;
            ctx.fillStyle = "rgba(" + pixelArr[p] + "," + pixelArr[p+1] + "," + pixelArr[p+2] + "," + pixelArr[p+3] + ")";
            ctx.fillRect(x,y,sample_size,sample_size);
        }


    let img2 = new Image();
    img2.src = c.toDataURL("image/png");
    img2.width = 100;
    document.body.appendChild(img2);
}

img1.src =document.getElementsByClassName("bio-img").src;