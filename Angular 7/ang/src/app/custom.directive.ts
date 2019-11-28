import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';



@Directive({
    selector : '[custDir]'
})






export class CustomDirective{
    constructor(public el : ElementRef){
        this.el.nativeElement.style.backgroundColor = 'red';
    }

    @HostBinding('style.backgroundColor') backgroundColor = 'green';
    @HostListener('mouseenter') m(){
        this.el.nativeElement.style.backgroundColor = 'brown';
    }
    @HostListener('mouseleave') n(){
        this.el.nativeElement.style.backgroundColor = 'blue';
    }
}