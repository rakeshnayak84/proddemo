import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'

import { AppComponent } from './app.component';
import { ProductDetailsComponent } from './components/product-details/product-details.component';
import { Routes, RouterModule } from '@angular/router';
import { ProductsComponent } from './components/products/products.component';

const appRoutes: Routes = [
  {
    path: 'products',
    component: ProductsComponent
  },
  {
    path: 'product-details/:id',
    component: ProductDetailsComponent
  },
  {
    path: '',
    redirectTo: '/products',
    pathMatch: 'full'
  }
]


@NgModule({
  declarations: [
    AppComponent,
    ProductDetailsComponent,
    ProductsComponent
  ],
  imports: [
    RouterModule.forRoot(appRoutes),
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
