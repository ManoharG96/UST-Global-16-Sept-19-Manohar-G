import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
name: string = 'Reddy';
imgUrl: 'https://pixabay.com/photos/flower-yellow-color-summer-4504952/';
address: string = 'Manohar G';
colorName: string = 'green';
isActive: boolean = false;
colspanValue: number = 2;

  constructor() { }

  ngOnInit() {
    setInterval(() => {
this.colorName = 'red';
this.isActive = !this.isActive;
}, 2000);
  }

}
