import {​​​​​​​​ Injectable }​​​​​​​​ from '@angular/core';
import {​​​​​​​​ HttpClient }​​​​​​​​ from '@angular/common/http';
@Injectable({​​​​​​​​
providedIn: 'root'
}​​​​​​​​)
export class CategoryService {​​​​​​​​
constructor(private http: HttpClient) {​​​​​​​​ }​​​​​​​​
getBooks(category) {​​​​​​​​
return this.http.get("http://localhost:1122/book/fetchData/categoryName/"+category);
 }​​​​​​​​
}​​​​​​​​

