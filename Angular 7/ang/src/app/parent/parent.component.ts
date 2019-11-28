import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCars ;
  Cars = [{
      name: 'New Model of audi',
      imgUrl: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__480.jpg'
  }, {
    name: 'ferari 2016',
    imgUrl: 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__480.jpg'
  }, {
  name: 'Audi z300',
  imgUrl: 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__480.jpg'
  }, {
  name: 'benz e300',
  imgUrl: 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__480.jpg'
  }
];
  constructor() { }

  ngOnInit() {
  }
sendImg(car) {
  console.log(car);
  this.selectedCars = car;
}
}
