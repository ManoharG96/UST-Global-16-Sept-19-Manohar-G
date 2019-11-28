import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bike-parent',
  templateUrl: './bike-parent.component.html',
  styleUrls: ['./bike-parent.component.css']
})
export class BikeParentComponent implements OnInit {
  Bikes = [{
    name: 'kawasaki',
    model: 'Model 2015',
    imgUrl: 'https://cdn.pixabay.com/photo/2014/10/24/08/31/motorcycle-500910__480.jpg',
    // tslint:disable-next-line: max-line-length
    descri: 'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000. '
  }, {
    name: 'suziki',
    model: 'Model 2016',
    imgUrl: 'https://cdn.pixabay.com/photo/2018/09/02/15/22/motorcycle-3649025_1280.jpg',
    // tslint:disable-next-line: max-line-length
    descri: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm. '
  }
];
  selectedBikes: any;
  constructor() { }

  ngOnInit() {
  }
  sendImg(bike) {
    console.log(bike);
    this.selectedBikes = bike;
  }
}
