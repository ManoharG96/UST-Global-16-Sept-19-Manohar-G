import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movie-parent',
  templateUrl: './movie-parent.component.html',
  styleUrls: ['./movie-parent.component.css']
})
export class MovieParentComponent implements OnInit {
  selectedMovie: any;
  Movies = [{
    name: 'advantures',
    rating : 'Rating: 5/10',
    imgUrl: 'https://cdn.pixabay.com/photo/2017/02/18/08/51/phang-nga-bay-2076836_1280.jpg',
    // tslint:disable-next-line: max-line-length
    descri: 'Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
  }, {
    name: 'Charlie Chaplin',
    rating : 'Rating: 6/10',
    imgUrl: 'https://cdn.pixabay.com/photo/2017/07/24/22/18/charlot-2536230_1280.jpg',
    // tslint:disable-next-line: max-line-length
    descri: 'Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, and composer who rose to fame in the era of silent film. He became a worldwide icon through his screen persona, "The Tramp", and is considered one of the most important figures in the history of the film industry.'
  }
];

  constructor() { }

  ngOnInit() {
  }
  sendImg(movie) {
    console.log(movie);
    this.selectedMovie = movie;
  }
}
