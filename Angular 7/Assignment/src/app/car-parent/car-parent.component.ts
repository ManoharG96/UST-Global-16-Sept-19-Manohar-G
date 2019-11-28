import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car-parent',
  templateUrl: './car-parent.component.html',
  styleUrls: ['./car-parent.component.css']
})
export class CarParentComponent implements OnInit {
  selectedCars ;
  Cars = [{
    name: 'Mercedes-Benz E-Class',
    imgUrl: 'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220_1280.jpg',
    model: 'Model 2015',
    // tslint:disable-next-line: max-line-length
    discri: 'The Mercedes-Benz E-Class has 2 Diesel Engine and 2 Petrol Engine on offer Depending upon the variant and fuel type the E-Class has a mileage of 10.98 to 18.0 kmpl. The E-Class is a 5 seater Sedan and has a length of 4988mm, width of 1907mm and a wheelbase of 2939mm. '
  }, {
    name: 'Audi RS3',
    imgUrl: 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019_1280.jpg',
    model: 'Model 2015',
    // tslint:disable-next-line: max-line-length
    discri: 'Specs overview. Engine. 2.5-liter five-cylinder. Horsepower. 394. Acceleration (0—60 mph) 3.9 seconds. Torque (lb-ft @ rpm) 354. Transmission. Seven-speed S tronic® dual-clutch automatic transmission and quattro® all-wheel drive. Top speed. 155 mph 7. Valvetrain. 20-valve DOHC with Audi valvelift. Combined mpg.'
  }, {
    name: 'Lamborghini Aventador',
    imgUrl: 'https://cdn.pixabay.com/photo/2018/12/10/01/31/car-3866116_1280.jpg',
    model: 'Model 2017',
    // tslint:disable-next-line: max-line-length
    discri: 'The Petrol engine is 6498 cc. It is available with the Automatic transmission. Depending upon the variant and fuel type the Aventador has a mileage of 5.0 to 7.69 kmpl. The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.'
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
