import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
    // tslint:disable-next-line: directive-selector
    selector: '[custom]'
})

// tslint:disable-next-line: directive-class-suffix
export class CustomDirectiveComponent {
    constructor(public el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'red';
    }

    @HostBinding('style.backgroundColor')backGround = 'blue';
    @HostListener('mouseenter') m() {
        this.el.nativeElement.style.backgroundColor = 'green';
    }
    @HostListener('mouseleave') l() {
        this.el.nativeElement.style.backgroundColor = 'white';
    }
}
