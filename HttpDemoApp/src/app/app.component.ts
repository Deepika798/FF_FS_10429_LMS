import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { UserService } from './user.service';
@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
    title = 'LibraryManagementSystemApp';
    formdata;
    books: any;
    constructor(private service: UserService) {
    }
    ngOnInit(): void {
        this.formdata = new FormGroup({
            category: new FormControl("")
        });
    }
    onClickSubmit(data) {
        this.service.getBooks(data.category).subscribe((data) => {
            console.log(data);
            this.books = Array.from(Object.keys(data), k => data[k]);
        });
    }
}

