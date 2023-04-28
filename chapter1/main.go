package main

import (
	"fmt"
	"time"
)

type comment struct {
	Id        int64
	content   string
	CreatedAt time.Time
	DeletedAt time.Time
	UpdateAt  time.Time
}
type Sayer interface {
	Say()
}
type dog struct {
	name  string
	age   int
	color string
}
type cat struct {
	name  string
	age   int
	color string
}
type gamer struct {
	name       string
	level      int
	experience int
	Atk        int
	Life       int
}
type atk interface {
	Attack(gamer)
}

func (g1 gamer) Attack(g2 gamer) {
	g2.Life = g2.Life - g1.Atk
	fmt.Println(g1.name, "attacked", g2.name, " and now ", g2.name, "'s life is' ", g2.Life)
}

func (d dog) Say() {
	fmt.Println(d.name)
	fmt.Println(d.age)
	fmt.Println(d.color)
}
func (c cat) Say() {
	fmt.Println(c.name)
	fmt.Println(c.age)
	fmt.Println(c.color)
}
func main() {

	var x Sayer
	a := cat{"Icey", 2, "white"}
	b := dog{"zeus", 3, "black"}
	x = a
	x.Say()
	x = b
	x.Say()
	var y atk
	m := gamer{"克豹武神", 32, 32831, 75, 580}
	n := gamer{"巨鲨天王", 49, 92345, 85, 970}
	y = m
	y.Attack(n)

}
