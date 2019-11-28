import { Component, OnInit } from '@angular/core';
import { FormControl, Validators, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent implements OnInit {

  get name() {
    return this.form.get('name');
  }
  get title() {
    return this.form.get('title');
  }
  get description() {
    return this.form.get('description');
  }
  get imageUrl() {
    return this.form.get('imageUrl');
  }

  form = new FormGroup( {
    title: new FormControl('', [Validators.required]),
    name: new FormControl('', [Validators.required]),
    description: new FormControl('', [Validators.required]),
    imageUrl: new FormControl('', [Validators.required])
  });
  constructor() { }

  ngOnInit() {
  }
  MovieData(form) {
    console.log(form.value);
  }
}
