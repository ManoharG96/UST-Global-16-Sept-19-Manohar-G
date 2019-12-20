import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddProductComponent } from './add-product/add-product.component';
import { GetAllComponent } from './get-all/get-all.component';
import { CartComponent } from './cart/cart.component';
import { OrderListComponent } from './order-list/order-list.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  {path : 'add-product', component : AddProductComponent},
  {path : 'get-all', component : GetAllComponent},
  {path : 'cart', component : CartComponent},
  {path : 'order-list', component : OrderListComponent},
  {path : '', component : HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
