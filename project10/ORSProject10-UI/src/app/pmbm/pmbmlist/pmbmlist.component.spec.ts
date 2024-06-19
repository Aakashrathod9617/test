import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PmbmlistComponent } from './pmbmlist.component';

describe('PmbmlistComponent', () => {
  let component: PmbmlistComponent;
  let fixture: ComponentFixture<PmbmlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PmbmlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PmbmlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
