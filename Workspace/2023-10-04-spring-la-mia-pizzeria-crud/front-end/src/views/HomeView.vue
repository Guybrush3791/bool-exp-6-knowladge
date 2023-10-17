<template>
  <main>
    <h1>Pizze</h1>    
    <button 
      v-if="!showCreateForm"
      @click="showCreateForm = true"
    >CREATE NEW PIZZA</button>
    <form
      v-if="showCreateForm"
    >
      <label for="name">Name</label>
      <input type="text" name="name">
    </form>
    <div
      v-if="!showCreateForm"
    >
      <ul>
        <li
          v-for="pizza in pizze"
          :key="pizza.id"
        >
          {{ pizza.name }}
        </li>
      </ul>
    </div>
  </main>
</template>

<script setup>
import { onMounted, ref } from 'vue';
import axios from "axios";

const API_URL = "http://localhost:8080/api/v1.0"

const pizze = ref(null);
const showCreateForm = ref(false);

onMounted(() => {

  axios.get(API_URL + "/pizzas")
       .then(res => {

          const data = res.data;
          pizze.value = data;
        })
       .catch(err => console.log(err));
});

</script>