import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  databaseUrl = 'https://ust-ty-8e9b9.firebaseio.com/';
  constructor(public http: HttpClient) { }

  postUser(data) {
    console.log('service:', data);
    return this.http.post(`${this.databaseUrl}/users.json`, data);
  }

  getUser() {
    return this.http.get(`${this.databaseUrl}/users.json`).pipe(
      map (data => {
        // tslint:disable-next-line: prefer-const
        let newArray = [];
        // tslint:disable-next-line: forin
        for (let key in data) {
          newArray.push({...data[key], id: key});
        }
        return newArray;
      })
    );
  }
  updateUser(id, data) {
    return this.http.put(`${this.databaseUrl}/users/${id}.json`, data);
  }
  deleteUser(id) {
    return this.http.delete(`${this.databaseUrl}/users/${id}.json`);
  }

}

