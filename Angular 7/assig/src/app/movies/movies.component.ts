import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  movies: any;
  movie: any;
  constructor(private http: HttpClient) {}
  get(event) {
    this.movie = event.target.value;
    this.http.get<any>('http://www.omdbapi.com/?apikey=f29c38a4&s=' + this.movie).subscribe(data => {
      this.movies = data.Search;
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('movies posted succesfully');
    });
  }
  ngOnInit() {
  }

}
