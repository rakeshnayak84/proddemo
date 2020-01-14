import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  constructor(private httpClient: HttpClient) { }

  public getUsers() {
	// http://details:8080/details
    return this.httpClient.get('http://' + window.location.host + '/detailsproxy/details');
  }

  // https://jsonplaceholder.typicode.com/users

  public getUserDetails(id: String) {
	// http://details:8080/details/{productId}
    return this.httpClient.get('http://' + window.location.host + '/detailsproxy/details/' + id);
  }

  public getReviews(id: String) {
	// http://reviews:8080/reviews/{productId}
    return this.httpClient.get('http://' + window.location.host + '/reviewsproxy/reviews/' + id);
  }
}
