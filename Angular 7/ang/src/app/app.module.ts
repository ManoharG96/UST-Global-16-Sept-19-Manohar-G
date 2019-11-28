import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.componenet';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DirectivesComponent } from './databinding/directives/directives.component';
import { StructuralComponent } from './databinding/directives/structural/structural.component';
import { NgIfComponent } from './databinding/directives/structural/ng-if/ng-if.component';
import { NgForComponent } from './databinding/directives/structural/ng-for/ng-for.component';
import { NgSwitchComponent } from './directive/structural/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { CompanyComponent } from './company/company.component';
import { CandiateComponent } from './candiate/candiate.component';
import { UsernameComponent } from './username/username.component';
import { ProductNameComponent } from './product-name/product-name.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DirectivesComponent,
    StructuralComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    CompanyComponent,
    CandiateComponent,
    UsernameComponent,
    ProductNameComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'home', component : HomeComponent},
      {path: 'about', component : AboutComponent},
      {path: 'help', component : HelpComponent},
      {path: 'login', component : LoginComponent},
      {path: 'property-binding', component: PropertyBindingComponent},
      {path: 'event-binding', component: EventBindingComponent},
      {path: 'two-way', component : TwoWayBindingComponent},
      {path: 'ngif', component : NgIfComponent},
      {path: 'ngfor', component : NgForComponent},
      {path: 'ngswitch', component : NgSwitchComponent},
      {path: 'register', component : RegisterComponent},
      {path: 'companyname', component: CompanyComponent},
      {path: 'CandiateName', component : CandiateComponent},
      {path: 'UserName', component : UsernameComponent},
      {path: 'ProductName', component : ProductNameComponent},
      {path: 'reactiveForm', component: ReactiveFormComponent},
      {path: 'parent', component: ParentComponent},
      {path: 'child', component: ChildComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
