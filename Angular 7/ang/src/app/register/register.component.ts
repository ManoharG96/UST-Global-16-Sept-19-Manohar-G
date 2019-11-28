import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { UserService } from '../user.service';
import { combineAll } from 'rxjs/operators';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {
  selectedUser;
  Users;
  today = new Date();
  constructor(public service: UserService) {
    console.log('constructor is excuited');
    this.getData();
  }

  ngOnInit() {
    console.log('ngOnIt is excuited');
  }
  ngDoCheck() {
console.log('doCheck is excuited');
  }

  ngAfterViewChecked() {
console.log('afterviewchecked is excuited');
}

ngAfterViewInit() {
  console.log('afterviewinit is excuited');
}
ngOnDestroy() {
  console.log('On destory is excuted');
}

  loginData(form) {
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data posted successfully');
    } );
  }
  getData() {
    this.service.getUser().subscribe(data => {
      console.log(data);
      this.Users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
  }
  deleteData(user) {
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log('data deleted successfully');
    });
  }
  selectUser(user) {
    console.log(user);
    this.selectedUser = user;
  }
  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id, form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data updated successfully');
    });
  }
}
