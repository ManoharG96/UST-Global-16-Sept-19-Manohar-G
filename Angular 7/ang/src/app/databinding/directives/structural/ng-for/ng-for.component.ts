import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

  products =[
      {
        img :'https://cdn.pixabay.com/photo/2018/02/01/19/21/easter-3123834_960_720.jpg',
        name :"Eggs",
        price :60
      },
      {
        img : 'https://cdn.pixabay.com/photo/2017/05/11/19/34/ice-2305159_960_720.jpg',
        name :"ice cream",
        price : 90
      },
      {
        img :'https://cdn.pixabay.com/photo/2016/10/09/14/00/vegetable-juices-1725835_960_720.jpg',
        name :"juices",
        price :60
      }
  ]

  constructor() { }

  ngOnInit() {
  }

}
