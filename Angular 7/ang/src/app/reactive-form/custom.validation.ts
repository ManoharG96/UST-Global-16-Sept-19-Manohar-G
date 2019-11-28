import { AbstractControl, ValidationErrors } from '@angular/forms';


export class CustomValidation {
    constructor() {}
    static unquie(control: AbstractControl): ValidationErrors | null {
        if (control.value === 'jon@gmail.com') {
            return {unquie: true};
        } else {
            return null;
        }
    }
}
