<template>
  <main>
    <h1>Pizze</h1>    
    <form 
      v-if="!showCreateForm && !showUpdateForm"
      @submit.prevent="getAllPizzas"
    >
      <input type="text" name="q" v-model="search" >
      <input type="submit" value="SEARCH">
    </form>
    <button 
      v-if="!showCreateForm && !showUpdateForm"
      @click="showCreateForm = true"
    >CREATE NEW PIZZA</button>
    <form
      v-if="showCreateForm"
      @submit.prevent="storePizza"
    >
      <label for="name">Name</label>
      <br>
      <input type="text" name="name" v-model="newPizza.name" >
      <br>
      <label for="description">Description</label>
      <br>
      <input type="text" name="description" v-model="newPizza.description" >
      <br>
      <label for="photo">Photo</label>
      <br>
      <input type="text" name="photo" v-model="newPizza.photo" >
      <br>
      <label for="price">Price</label>
      <br>
      <input type="number" name="price" v-model="newPizza.price" >
      <br><br>
      <input type="submit" value="CREATE">
      <button @click="clearCreate">CANCEL</button>
    </form>
    <form
      v-if="showUpdateForm"
      @submit.prevent="pizzaUpdate"
    >
      <label for="name">Name</label>
      <br>
      <input type="text" name="name" v-model="editPizza.name" >
      <br>
      <label for="description">Description</label>
      <br>
      <input type="text" name="description" v-model="editPizza.description" >
      <br>
      <label for="photo">Photo</label>
      <br>
      <input type="text" name="photo" v-model="editPizza.photo" >
      <br>
      <label for="price">Price</label>
      <br>
      <input type="number" name="price" v-model="editPizza.price" >
      <br><br>
      <input type="submit" value="UPDATE">
      <button @click="showUpdateForm = false">CANCEL</button>
    </form>
    
    <div
      v-if="!showCreateForm && !showUpdateForm"
    >
      <ul>
        <li
          v-for="pizza in pizze"
          :key="pizza.id"
        >
          {{ pizza.name }}
          <button
            @click="pizzaDelete(pizza.id)"
          >X</button>
          <button @click="pizzaEdit(pizza.id)"
          >EDIT</button>
        </li>
      </ul>
    </div>
  </main>
</template>

<script setup>
import { onMounted, ref } from 'vue';
import axios from "axios";

const API_URL = "http://localhost:8080/api/v1.0"

const search = ref("");
const pizze = ref(null);

const showCreateForm =ref(false);
const showUpdateForm =ref(false);

const emptyPizza = {
  name: null,
  description: null,
  photo: null,
  price: null
};
const newPizza = ref({...emptyPizza});

const editPizza = ref({});

function clearForm() {

  showCreateForm.value
    = showUpdateForm.value 
    = false;

  newPizza.value = ref({...emptyPizza});
}
function storePizza() {

  axios.post(API_URL + "/pizzas", newPizza.value)
       .then(() => {
        
        clearForm();
       })
       .catch(err => console.log(err));
}
function pizzaDelete(id) {

  axios.delete(API_URL + "/pizzas/" + id)
       .then(() => {

          getAllPizzas();
       })
       .catch(err => console.log(err))
}
function pizzaEdit(id) {

  for (const pizza of pizze.value) 
    if (pizza.id == id)
      editPizza.value = {...pizza};

  showUpdateForm.value = true;
}
function pizzaUpdate() {

  axios.put(API_URL + "/pizzas/" + editPizza.value.id, editPizza.value)
       .then(() => {

          clearForm();
          getAllPizzas();
       })
       .catch(err => console.log(err));
}
function getAllPizzas() {

  let param = "";
  if (search.value != null && search.value.length > 0)
    param = "?q=" + search.value;

  axios.get(API_URL + "/pizzas" + param)
       .then(res => {

          const data = res.data;
          pizze.value = data;
        })
       .catch(err => console.log(err));
}
onMounted(() => {

   getAllPizzas();
});

</script>