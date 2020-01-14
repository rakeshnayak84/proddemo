import { Component, OnInit } from '@angular/core';
import { UsersService } from 'src/app/shared/service/users.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})
export class ProductsComponent implements OnInit {
  title = 'spring-product';
  details: any;

  constructor(private userService: UsersService) { }

  ngOnInit() {
    this.userService.getUsers()
    .subscribe((data) => {
      console.log(data);
      this.details = data;
    });
  }

}
