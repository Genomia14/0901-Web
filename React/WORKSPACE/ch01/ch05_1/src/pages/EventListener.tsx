// 자바스크립트로 태그에 이벤트를 추가하는 방식
document.getElementById("root")?.addEventListener("click", (e: Event) => {
  const { isTrusted, target, bubbles } = e;
  console.log("mouse click occurrs.", isTrusted, target, bubbles);
});
document.getElementById("root")?.addEventListener("click", (e: Event) => {
  const { isTrusted, target, bubbles } = e;
  console.log("mouse click also occurs.", isTrusted, target, bubbles);
});
export default function EventListener() {
  return <div>EventListener</div>;
}
