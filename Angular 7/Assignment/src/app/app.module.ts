import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { HeaderComponentComponent } from './header-component/header-component.component';
import { RouterModule } from '@angular/router';
import { CarParentComponent } from './car-parent/car-parent.component';
import { CarChildComponent } from './car-child/car-child.component';
import { BikeParentComponent } from './bike-parent/bike-parent.component';
import { BikeChildComponent } from './bike-child/bike-child.component';
import { MobileParentComponent } from './mobile-parent/mobile-parent.component';
import { MobileChildComponent } from './mobile-child/mobile-child.component';
import { MovieChildComponent } from './movie-child/movie-child.component';
import { MovieParentComponent } from './movie-parent/movie-parent.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { FormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponentComponent,
    HeaderComponentComponent,
    CarParentComponent,
    CarChildComponent,
    BikeParentComponent,
    BikeChildComponent,
    MobileParentComponent,
    MobileChildComponent,
    MovieChildComponent,
    MovieParentComponent,
    CommentComponent,
    CommentDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    RouterModule.forRoot([
      {path: 'home', component: HomeComponentComponent},
      {path: 'car', component: CarParentComponent},
      {path: 'bike', component: BikeParentComponent},
      {path: 'mobile', component: MobileParentComponent},
      {path: 'movie', component: MovieParentComponent},
      {path: 'comments', component: CommentDetailsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
