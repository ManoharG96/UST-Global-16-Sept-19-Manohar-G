import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MoviesComponent } from './movies/movies.component';
import { ReactiveComponent } from './reactive/reactive.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  {path: 'movies', component: MoviesComponent },
  {path: 'reactive', component: ReactiveComponent},
  {path: 'login', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
